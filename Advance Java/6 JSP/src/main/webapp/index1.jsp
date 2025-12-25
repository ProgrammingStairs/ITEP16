<!DOCTYPE html>
<html>
	<head>
		<title>JSP Examples</title>
	</head>
	<body>
		<h2>Jsp Scripting Elements Example</h2>
		<form action="bill.jsp">
		<table border="1" cellspacing="0" cellpadding="5">
			<tr>
				<th>S.No</th>
				<th>Category</th>
				<th>Quantity</th>
				<th>Price<br>(Per Item)</th>
			</tr>
			<tr>
				<td>101</td>
				<td>Soap</td>
				<td>
					<input type="number" min="0" placeholder="Enter Quantity" name="q1" id="q1">
				</td>
				<td>
					<input type="number" min="0" placeholder="Enter Price" name="p1" id="p1">
				</td>
			</tr>
			<tr>
				<td>102</td>
				<td>Fairness Cream</td>
				<td>
					<input type="number" min="0" placeholder="Enter Quantity" name="q2" id="q2">
				</td>
				<td>
					<input type="number" min="0" placeholder="Enter Price" name="p2" id="p2">
				</td>
			</tr>
			<tr>
				<td colspan="2">GST</td>
				<td>
					<input type="number" min="0" placeholder="Enter GST" name="gst" id="gst">
				</td>
				<td>
					<input type="submit" value="Total">
				</td>
			</tr>
		</table>
		</form>
	</body>
</html>
