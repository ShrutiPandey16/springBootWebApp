<%@page language="java" %>

    <!DOCTYPE html>
    <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Calculator</title>
            <link rel="stylesheet" href="styles.css"> <!-- Linking the CSS file -->
        </head>

        <body>
            <!-- <h2>Sum is <%= session.getAttribute("sum") %></h2> -->
            <!-- <h2>Sum is ${sum}</h2> JSTL (JavaServer Pages Standard Tag Library) way -->
            <div class="container">
                <h3>${alien}</h3>
                <h2>Welcome to the ${course} world!</h2>
            </div>

        </body>

    </html>