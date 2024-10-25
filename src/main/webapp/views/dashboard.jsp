<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Assurance</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            background-color: #f8f9fa;
            font-family: Arial, sans-serif;
        }
        .container {
            margin-top: 50px;
            background-color: white;
            border-radius: 10px;
            box-shadow: 0 0 15px rgba(0, 0, 0, 0.2);
            padding: 30px;
        }
        h1 {
            text-align: center;
            color: #343a40;
        }
        .btn-custom {
            background-color: #007bff;
            color: white;
        }
        .btn-custom:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

<div class="container">
    <h1>Add Assurance</h1>
    <form action="addAssurance" method="post">
        <div class="form-group">
            <label for="name">Assurance Name:</label>
            <input type="text" class="form-control" id="name" name="name" required>
        </div>
        <div class="form-group">
            <label for="type">Type:</label>
            <select class="form-control" id="type" name="type" required>
                <option value="" disabled selected>Select Type</option>
                <option value="Health">Health</option>
                <option value="Life">Life</option>
                <option value="Car">Car</option>
                <option value="Home">Home</option>
            </select>
        </div>
        <div class="form-group">
            <label for="premium">Premium Amount:</label>
            <input type="number" class="form-control" id="premium" name="premium" required>
        </div>
        <div class="form-group">
            <label for="coverage">Coverage Amount:</label>
            <input type="number" class="form-control" id="coverage" name="coverage" required>
        </div>
        <div class="form-group">
            <label for="duration">Duration (in years):</label>
            <input type="number" class="form-control" id="duration" name="duration" required>
        </div>
        <button type="submit" class="btn btn-custom">Add Assurance</button>
    </form>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
