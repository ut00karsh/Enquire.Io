<html>
    <head>
       
<script src="//cdn.quilljs.com/1.0.0/quill.js"></script>
<script src="//cdn.quilljs.com/1.0.0/quill.min.js"></script>
<link href="//cdn.quilljs.com/1.0.0/quill.snow.css" rel="stylesheet">
<link href="//cdn.quilljs.com/1.0.0/quill.bubble.css" rel="stylesheet">
<link href="//cdn.quilljs.com/1.0.0/quill.core.css" rel="stylesheet">
<script src="//cdn.quilljs.com/1.0.0/quill.core.js"></script>
    </head>
    <body>
<link href="https://cdn.quilljs.com/1.0.0/quill.snow.css" rel="stylesheet">

<div style="height:30%;width:45%;">
<div id="toolbar">
  <button class="ql-bold">Bold</button>
  <button class="ql-italic">Italic</button>
</div>


<div id="editor" >
 
</div>
</div>
<script src="https://cdn.quilljs.com/1.0.0/quill.js"></script>

<script>
  var editor = new Quill('#editor', {
    modules: { toolbar: '#toolbar' },
    theme: 'snow'
  });
</script>
</body>
</html>