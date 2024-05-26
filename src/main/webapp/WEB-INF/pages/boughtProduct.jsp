<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bought Product</title>
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
            text-align: center;
        }

        h1, h2 {
            margin-bottom: 20px;
        }

        p {
            margin-bottom: 10px;
        }

        ul {
            list-style: none;
            padding: 0;
        }

        li {
            margin-bottom: 10px;
        }

        a {
            text-decoration: none;
            color: #333;
            transition: color 0.3s ease;
        }

        a:hover {
            color: #666;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Bought Product</h1>

    <div>
        <h2>Product Details</h2>
        <p>Name: ${product.name}</p>
        <p>Price: ${product.price}</p>
        <p>Seller: ${product.seller.name}</p>
    </div>

    <div>
        <p>You have successfully bought the product: ${product.name}</p>
        <p>Would you like to:</p>
        <ul>
            <li><a href="index.jsp">Go to Main Page</a></li>
            <li><a href="showAllProducts">Return to Products Page</a></li>
        </ul>
    </div>
</div>
</body>
</html>
