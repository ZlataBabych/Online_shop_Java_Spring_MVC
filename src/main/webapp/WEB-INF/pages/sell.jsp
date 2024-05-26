<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sell</title>
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

        .error-message {
            text-align: center;
            color: red;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Sell Your Products</h1>

    <div>
        <h2>Create New Seller</h2>

        <form action="sell/addSeller" method="post">
            <label for="sellerName">Name:</label>
            <input type="text" id="sellerName" name="name" required><br><br>

            <label for="sellerLocation">Location:</label>
            <input type="text" id="sellerLocation" name="location" required><br><br>

            <label for="sellerCardNumber">Card Number:</label>
            <input type="text" id="sellerCardNumber" name="cardNumber" required><br><br>

            <input type="submit" value="Create Seller">
        </form>
    </div>

    <div>
        <h2>Login as Existing Seller</h2>

        <form action="sell/loginSeller" method="post">
            <label for="sellerId">Seller ID:</label>
            <input type="text" id="sellerId" name="sellerId" required><br><br>

            <input type="submit" value="Login">
        </form>
    </div>

    <c:if test="${not empty error}">
        <p class="error-message">${error}</p>
    </c:if>
</div>

</body>
</html>
