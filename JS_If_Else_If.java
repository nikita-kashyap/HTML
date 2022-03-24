<html>
<body>

<p>Click the button to get a time-based greeting:</p>

<button onclick="myFunction()">Click! </button>

<p id="demo"></p>

<script>
function myFunction() {
  var t;
  var time = new Date().getHours();
  if (time < 10) {
   t = "Good morning";
  } else if (time < 20) {
    t = "Good day";
  } else {
   t = "Good evening";
  }
  document.getElementById("demo").innerHTML =t;
}
</script>

</body>
</html>