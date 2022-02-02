<?php $id = $_GET["id"];
print_r($id);
$info = file_get_contents("msg.txt");
$lylist=unserialize($info);
//$lylist = explode("@@@", $info);
unset($lylist[$id]);
$ninfo = serialize( $lylist);
file_put_contents("msg.txt", $ninfo);
echo "<script>alert('删除成功');location.href='project01.php';</script>";?>