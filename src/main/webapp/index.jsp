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
		});
	</script>
	<h2>Hello a sah!</h2>
	<p id="productname">Productnaam = </p>
</body>
</html>
