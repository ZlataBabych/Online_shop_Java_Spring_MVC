<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Seller Dashboard</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #ADFF2F;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: flex-start;
            flex-wrap: wrap;
        }

        .container {
            width: 400px;
            margin: 20px;
            padding: 20px;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        h1 {
            text-align: center;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        th, td {
            padding: 10px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #f2f2f2;
        }

        tr:hover {
            background-color: #f9f9f9;
        }

        form {
            margin-top: 20px;
        }

        label {
            display: block;
            margin-bottom: 5px;
        }

        input[type="text"],
        input[type="submit"] {
            width: calc(100% - 20px);
            padding: 8px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }

        .back-link {
            display: block;
            text-align: center;
            margin-top: 20px;
            margin-bottom: 20px; /* Знизу */
            text-decoration: none;
            color: #007bff;
        }

        .back-link:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>Welcome, ${seller.name}</h2>

    <h2>Your Products</h2>
    <table>
        <tr>
            <th>Product ID</th>
            <th>Name</th>
            <th>Price</th>
        </tr>
        <c:forEach var="product" items="${products}">
            <tr>
                <td>${product.id}</td>
                <td>${product.name}</td>
                <td>${product.price}</td>
            </tr>
        </c:forEach>
    </table>

    <h2>Your Payments</h2>
    <table>
        <tr>
            <th>Payment ID</th>
            <th>Amount</th>
            <th>Customer Card Number</th>
        </tr>
        <c:forEach var="payment" items="${payments}">
            <tr>
                <td>${payment.id}</td>
                <td>${payment.amount}</td>
                <td>${payment.customerCardNumber}</td>
            </tr>
        </c:forEach>
    </table>
</div>

<div class="container">
    <h2>Add New Product</h2>

    <form action="addProduct" method="post">
        <input type="hidden" name="sellerId" value="${seller.id}">

        <label for="productName">Product Name:</label>
        <input type="text" id="productName" name="name" required>

        <label for="productPrice">Price:</label>
        <input type="text" id="productPrice" name="price" required>

        <input type="submit" value="Add Product">
    </form>
</div>

<a href="../index.jsp" class="back-link">Back to main page</a>
</body>
</html>

