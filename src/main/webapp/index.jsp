<html>
<head>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
	<script>
		$.getJSON('http://localhost:1555/RESTfullApp/rest/hello/heh', function(
				data) {
			console.log(data);
			$('#productname').append(data.productname);
			$('#price').append(data.price);
			$('#category').append(data.category);
		});
	</script>
	<h2>Product</h2>
	<p id="productname">Productnaam = </p>
	<p id="price">Productnaam = </p>
	<p id="category">Productnaam = </p>
</body>
</html>
