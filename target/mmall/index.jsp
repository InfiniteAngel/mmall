<html>
<body>
<h2>Hello World!</h2>

SpringMVC上传文件测试
<form name="form1" action="/manage/product/upload.do" method="post" enctype="multipart/form-data">
    <input type="file" name="upload_file"/>
    <input type="submit" value="上传文件">


    SpringMVC富文本文件上传文件测试
    <form name="form1" action="/manage/product/richtext_img_upload.do.do" method="post" enctype="multipart/form-data">
        <input type="file" name="upload_file"/>
        <input type="submit" value="富文本上传文件">

    </form>
</body>
</html>
