<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Вхід</title>
    <style>
        body {
            background-color: #ADFF2F; /* Змінюємо фон на інший колір */
            font-family: Arial, sans-serif; /* Встановлюємо шрифт */
            align-items: center;
            text-align: center; /* Центруємо текст та кнопки */
        }

        h1 {
            font-size: 32px; /* Збільшуємо розмір тексту */
            color: #333; /* Змінюємо колір тексту */
            margin-bottom: 20px; /* Додаємо проміжок після заголовка */
        }

        .button {
            display: inline-block; /* Розташовуємо кнопки поруч */
            padding: 15px 30px; /* Збільшуємо відступи */
            font-size: 18px; /* Збільшуємо розмір тексту кнопки */
            background-color: #4CAF50; /* Змінюємо колір фону кнопок */
            color: white; /* Змінюємо колір тексту кнопок */
            border: none; /* Видаляємо рамку кнопок */
            border-radius: 5px; /* Додаємо закруглені кути */
            cursor: pointer; /* Змінюємо вигляд курсору на кнопках */
            margin: 10px; /* Додаємо зовнішні відступи */
            transition: all 0.3s ease; /* Додаємо анімацію зміни стилів */
        }

        .button:hover {
            background-color: #45a049; /* Змінюємо колір фону кнопок при наведенні курсора */
        }
    </style>
</head>
<body>
<br>
<br>
<h1>Вхід</h1>

<h2>Хочу купити</h2>
<form action="buy" method="post">
    <button type="submit" class="button">Купити</button>
    <input type="hidden" name="action" value="buy">
</form>

<h2>Хочу продати</h2>
<form action="sell" method="post">
    <button type="submit" class="button">Продати</button>
    <input type="hidden" name="action" value="sell">
</form>
</body>
</html>
