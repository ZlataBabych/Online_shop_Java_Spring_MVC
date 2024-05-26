<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Товари</title>
</head>
<body>
<h1>Товари</h1>

<table>
    <thead>
    <tr>
        <th>Назва товару</th>
        <th>Ціна</th>
        <th>Галочка</th>
    </tr>
    </thead>
    <tbody>
    <!-- Вставте сюди код для відображення товарів з бази даних -->
    </tbody>
</table>

<p>Загальна сума: <span id="totalAmount">0</span></p>
<button onclick="buy()">Кошик</button>

<script>
    function buy() {
        // Логіка для обробки натискання кнопки "Кошик"
    }
</script>
</body>
</html>
