<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Buy Product</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #ADFF2F;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .container {
            width: 400px;
            padding: 20px;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        h1, h2 {
            text-align: center;
        }

        form {
            margin-top: 20px;
        }

        label {
            display: block;
            margin-bottom: 5px;
        }

        input[type="text"],
        input[type="email"],
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

        p.message {
            text-align: center;
            color: green;
        }

        a {
            display: block;
            text-align: center;
            margin-top: 20px;
            text-decoration: none;
            color: #333;
        }

        a:hover {
            color: #666;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Buy Product</h1>

    <div>
        <h2>Product Details</h2>
        <p>Name: ${product.name}</p>
        <p>Price: ${product.price}</p>
        <p>Seller: ${product.seller.name}</p>
    </div>

    <form action="buyProduct" method="post">
        <input type="hidden" name="productId" value="${product.id}">

        <label for="customerCardNumber">Your Card Number:</label>
        <input type="text" id="customerCardNumber" name="customerCardNumber" required><br><br>

        <label for="customerFirstName">Your First Name:</label>
        <input type="text" id="customerFirstName" name="customerFirstName" required><br><br>

        <label for="customerLastName">Your Last Name:</label>
        <input type="text" id="customerLastName" name="customerLastName" required><br><br>

        <label for="customerEmail">Your Email:</label>
        <input type="email" id="customerEmail" name="customerEmail" required><br><br>

        <input type="submit" value="Buy">
    </form>

    <p class="message">${message}</p>


    <a href="showAllProducts">Return to Products Page</a>

    <a href="index.jsp">Back to main page</a>

</div>
</body>
</html>
