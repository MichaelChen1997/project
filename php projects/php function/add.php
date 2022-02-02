<?php
header('content-type:text/html;charset=utf-8');
date_default_timezone_set('PRC');
$filename = "msg.txt";
$mags = [];
if(file_exists($filename)){
    $string=file_get_contents($filename);
    if (strlen($string)){
        $msg=unserialize($string);
    }
}
if(isset($_POST['publish'])){
    $username=$_POST['username'];
    $title=strip_tags($_POST['title']);
    $content=strip_tags($_POST['content']);
    $time=time();
    $data=compact('username','title','content','time');
    array_push($mags, $data);
    $mags=serialize($mags);
    if (file_put_contents($filename,$mags)){
        echo "<script>alert('留言成功！');location.href='project01.php';</script>";
    } else{
        echo "<script>alert('留言失败！');location.href='project01.php';</script>";
    }
}

?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Bootstrap 4, from LayoutIt!</title>

    <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <style>
        footer{
            padding-top: 60px;
        }
        td:first-of-type{
            text-align: right;
            width: 100px;
        }
        .btn-secondary{
            transform: translate(20px ,0);
        }
        .username{
            width: 250px;
        }
        .title{
            width: 500px;
        }
        .content{
            width: 500px;
            height: 300px;
        }
        .submit{
            padding-top: 30px;
        }
        .release{
            position: relative;
        }
    </style>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-2">
        </div>
        <div class="col-md-8">
            <div class="page-header">
                <h1>
                    IMOOC留言板-V1.0
                </h1>
            </div>
            <div class="jumbotron">
                <h2>
                    既然来了，就说点什么吧~~~~
                </h2>
                <p>
                    把你想说的都写在下面，标注好你的姓名，主题，点击提交发送给我们，让小伙伴门都知道你在想写什么
                </p>
            </div>
            <form class="release" action="#" method="post">
                <p>发布</p>
                <table class="table submit">
                    <tbody>
                    <tr>
                        <td>用户名</td>
                        <td class="userName"><input type="text"  class="username" name="username"></td>
                    </tr>
                    <tr>
                        <td>标题</td>
                        <td class="title"><input type="text"  class="title" name="title"></td>
                    </tr>
                    <tr>
                        <td>内容</td>
                        <td class="content"><textarea class="content" name="content"></textarea></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <button class="btn btn-sm btn-primary btn-sub" name="publish">留言完成</button>
                            <button class="btn btn-sm btn-secondary btn-sub" name="view" onclick="{location.href='project01.php'}">查看留言</button>
                        </td>
                    </tr>
                    </tbody>
                </table>
            </form>
            <footer>慕课商城@2017 powered by <strong>IMOOC.INC</strong></footer>
        </div>
        <div class="col-md-2">
        </div>
    </div>
</div>
<script>
</script>
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/scripts.js"></script>
</body>
</html>