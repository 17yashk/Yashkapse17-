const express = require("express");
const app = express();
const PORT = 3000;

app.use(express.json());

let trades = [];

/* ================= FRONTEND ================= */
app.get("/", (req, res) => {
  res.send(`
<!DOCTYPE html>
<html>
<head>
  <title>Trade India</title>
  <style>
    body {
      font-family: Arial;
      background: #f4f4f4;
      padding: 20px;
    }
    h1 {
      color: #2c3e50;
    }
    .form input, .form select {
      padding: 8px;
      margin: 5px;
    }
    button {
      padding: 8px 15px;
      background: #27ae60;
      color: white;
      border: none;
      cursor: pointer;
    }
    ul {
      background: white;
      padding: 10px;
    }
  </style>
</head>
<body>

<h1>Trade India – Import & Export Management</h1>

<div class="form">
  <input type="text" id="product" placeholder="Product Name">
  <input type="text" id="country" placeholder="Country">

  <select id="type">
    <option value="Import">Import</option>
    <option value="Export">Export</option>
  </select>

  <input type="number" id="quantity" placeholder="Quantity">
  <button onclick="addTrade()">Add Trade</button>
</div>

<h2>Trade List</h2>
<ul id="tradeList"></ul>

<script>
function addTrade() {
  const product = document.getElementById("product").value;
  const country = document.getElementById("country").value;
  const type = document.getElementById("type").value;
  const quantity = document.getElementById("quantity").value;

  fetch("/add-trade", {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify({ product, country, type, quantity })
  })
  .then(res => res.json())
  .then(() => loadTrades());
}

function loadTrades() {
  fetch("/trades")
    .then(res => res.json())
    .then(data => {
      const list = document.getElementById("tradeList");
      list.innerHTML = "";
      data.forEach(t => {
        const li = document.createElement("li");
        li.textContent = t.product + " | " + t.type + " | " + t.country + " | Qty: " + t.quantity;
        list.appendChild(li);
      });
    });
}

loadTrades();
</script>

</body>
</html>
  `);
});

/* ================= BACKEND ================= */

// Add trade
app.post("/add-trade", (req, res) => {
  const { product, country, type, quantity } = req.body;

  trades.push({ product, country, type, quantity });
  res.json({ message: "Trade added successfully" });
});

// Get all trades
app.get("/trades", (req, res) => {
  res.json(trades);
});

app.listen(PORT, () => {
  console.log("Server running at http://localhost:" + PORT);
});
