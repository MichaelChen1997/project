<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>打印图片</title>
    <style type="text/css">
        input{
            width: 240px;
            height: 30px;
            font-size: 16px;
            line-height: 16px;
        }
        button{
            height: 40px;
            font-size: 16px;
            line-height: 16px;
            background: #fff;
            border: 1px solid #000;
            transform: translate(0px, 10px);
        }
    </style>
</head>
<body>
<form action="" method="POST" >
    <input type="text" name="num"  placeholder="请输入要打印的行数" autocomplete="off">
    <br>
    <button type="submit"  name="button" value="pyramid">金字塔</button>
    <button type="submit" name="button" value="diamond" >空心菱形</button>
</form>
<?php
    $param=$_POST;
    if($_POST) {
        if ($param['button'] == "pyramid") {
            $num = $_POST['num'];
            for ($i = 1; $i <= $num; $i++) {
                for ($j = 1; $j <= $num - $i; $j++) {
                    echo "<span style='color:#fff;'>*</span>";
                }
                for ($k = 1; $k <= 2 * $i - 1; $k++) {
                    echo "*";
                }
                echo "<br/>";
            }
        }elseif($param['button'] == "diamond") {
            $num=$_POST['num'];
            for($i=1;$i<=$num;$i++) {
                for($b=1;$b<=$num-$i;$b++) {
                    echo "<span style='color:#fff;'>*</span>";
                }
                for($c=1;$c<=2*$i-1;$c++) {
                    if($c==1 || $c==2*$i-1) {
                        echo "*";
                    }else{
                        echo "<span style='color:#fff;'>*</span>";
                    }
                }
                echo "<br/>";
            }
            for($i=$num-1;$i>=1;$i--) {
                for($b=1;$b<=$num-$i;$b++) {
                    echo "<span style='color:#fff;'>*</span>";
                }
                for($c=1;$c<=2*$i-1;$c++) {
                    if($c==1 || $c==2*$i-1) {
                        echo "*";
                    }else{
                        echo "<span style='color:#fff;'>*</span>";
                    }
                }
                echo "<br/>";
            }
        }else{
            echo "";
        }
    }
?>
</body>
</html>