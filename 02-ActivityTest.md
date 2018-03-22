# AndroidManifest.xml 作用
* 所有的组件都要在此文件注册
* android:name=".FirstActivity" => 省略了包名
* android:label="This is first Activity" => 主activity的lable也是程序名称
* <intent-filter> => 过滤标签，可以用来指定启动策略和行为方式

# onCreate方法
* setContentView 指定此class对应的 activity
* Toast 事件
* finish方法销毁activity，如果是主活动页，则直接关闭应用

# Intent

## 显式Intent
参数：
* Context 上下文
* Class 想要启动的目标活动

## 隐式Intent