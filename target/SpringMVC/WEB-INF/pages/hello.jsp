<%@ page import="com.devcolibri.common.controller.HelloController" %>
<%@ page contentType="text/html; ISO-8859-1" language="java" %>


<html>
<head>
	<style>#mymap { position: absolute;
		top: 50px;
		left: 15px;
		width: 700px;
		height: 700px; }</style>
	<script src = "https://maps.google.com/maps/api/js?sensor=false"></script>
	<script>
		function init() {
			var mapDiv = document.getElementById("mymap");
			var mapOptions = {
				center: new google.maps.LatLng(29638956/600000 , 19989630/600000),
				zoom: 15,
				mapTypeId: google.maps.MapTypeId.ROADMAP
			};
			var map = new google.maps.Map(mapDiv, mapOptions);

			var destinacions = [];

			<% HelloController p = new HelloController() ;
			int[] mas1 = p.f();
			int[] mas2 = p.f2();
			%>
			<%for (int i=0;i<99900;i++ ){
			if(mas1[i]!=0 && mas2[i]!=0){%>



			destinacions.push(new google.maps.LatLng(<%=(float)mas1[i]/600000.0%>,<%=(float)mas2[i]/600000.0%>));
			<%}}%>
			destinacions.push(new google.maps.LatLng(29638992/600000 , 19989684/600000));

			var polylineOptions = {path: destinacions,
				strokeColor:"#ff0000",strokeWeight:1};
			var polyline = new google.maps.Polyline(polylineOptions);
			polyline.setMap(map);


			var destinacions1 = new google.maps.MVCArray();
			destinacions1.push(new google.maps.LatLng(30265006/600000 , 18220052/600000));
			destinacions1.push(new google.maps.LatLng(30265508/600000 , 18220972/600000));
			destinacions1.push(new google.maps.LatLng(30265911/600000 , 18220062/600000));

			var polygonOptions = {path: destinacions1,
				strokeColor:"#ff8888"};
			var polygon = new google.maps.Polygon( polygonOptions);
			polygon.setMap(map);



		}
		window.onload = init;
	</script>
</head>
<body>
<h2>KUZIV KARTA KOKOKO KOOKOKOKO</h2>
<div id="mymap"></div>
<div id="info"></div>
</body>
</html>