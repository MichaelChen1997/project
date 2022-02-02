<?php
header('content-type:text/html;charset=utf-8');
date_default_timezone_set('PRC');
$filename = "msg.txt";
$mags = [];
if(file_exists($filename)){
    $string=file_get_contents($filename);
    if (strlen($string)){
        $mags=unserialize($string);
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
            <?php if (is_array($mags)&&count($mags)>0):?>
                <table class="table">
                    <theade>
                        <tr>
                            <th>
                                编号
                            </th>
                            <th>
                                用户名
                            </th>
                            <th>
                                标题
                            </th>
                            <th>
                                时间
                            </th>
                            <th>
                                内容
                            </th>
                            <th>
                                操作
                            </th>
                        </tr>
                    </theade>
                    <tbody>
                    <?php foreach ($mags as $key=>$val):?>
                        <tr  class="table-approved">
                            <td>
                                <?php echo $key+1;?>
                            </td>
                            <td>
                                <?php echo $val['username'];?>
                            </td>
                            <td>
                                <?php echo $val['title'];?>
                            </td>
                            <td>
                                <?php echo date("m/d/Y H:i:s", $val['time']);?>
                            </td>
                            <td>
                                <?php echo $val['content'];?>
                            </td>
                            <td>
                                <a  href="edit.php?key=<?php echo $key?>">编辑</a> | <a href="delete.php?key=<?php echo $key?>">删除</a>
                            </td>
                        </tr>
                    <?php endforeach;?>
                    </tbody>
                    <?php endif;?>
                    <tfoot>
                    <tr>
                        <td>
                            <button type="button" class="btn btn-sm btn-primary"  onclick="{location.href='add.php'}">我要留言</button>
                        </td>
                    </tr>
                    </tfoot>
                </table>
            <footer>慕课商城@2017 powered by <strong>IMOOC.INC</strong></footer>
        </div>
        <div class="col-md-2">
        </div>
    </div>
</div>
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/scripts.js"></script>
</body>
</html>