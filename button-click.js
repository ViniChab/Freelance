<!DOCTYPE html>
<html>
	
	<style>
	iframe
	{
		width: 100%;
		height: 635px;
		margin: 0; 
		border: 0;
		padding: 0;
	}
	
	button
	{
		position: absolute;
		top: 300px;
	}
	
	</style>
	
	<script>
		
		function likeFunction() 
			{
			var iframe = document.getElementById("myFrame");
			var elmnt = iframe.contentWindow.document.getElementsByTagName("a")[0];
			elmnt.click();
		}
		
	</script>
	
	<iframe id='myFrame' src=https://billwurtz.com/>
	</iframe>
	
	<button onclick="likeFunction()"> Click me! </button>
	 
</html> 
