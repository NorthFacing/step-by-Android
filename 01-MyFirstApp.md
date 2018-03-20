# hello word

## 创建项目

## 编译
```
chmod +x gradlew
./gradlew assembleDebug
```

## 页面布局

* 组件
	- 文本输入框：Text -> Plain Text
	- 按钮：Widgets -> Button

* 属性
	- 常量设置：strings.xml 中增加常量数据
	- 文本框：左边距16，上边距16
	- 按钮：右边距16
* 自适应
	- chain：选中两个组件，右键： Chain > Create Horizontal Chain
	- 水平对齐中约束视图：点击按钮，然后点击 EditBaseline，选中中间的“基线锚点”，点击并按住此锚点，
	  然后将其拖动到文本框中显示的基线锚点。
	- 点击文本框以查看其属性。点击两次宽度指示器，确保将其设置为 Match Constraints，使文本输入框
	  能够充满除了按钮和边距以外的水平空间。

## 方法调用

### 调用方法
在activity对应的class文件中定义一个符合如下条件的方法，就可以被响应组件的onClick方法：

* 公共访问
* 空返回值
* 以 View 作为唯一参数（它是之前点击的 View 对象）

### Intent

Intent 是指在相互独立的组件（如两个 Activity）之间提供运行时绑定功能的对象。Intent 表示一个应用“执行某项操作的意向”。您可以将 intent 用于各种任务，但在本课中，您的 intent 用于启动另一个 Activity。

* Intent 构造函数采用两个参数：
	- Context 是第一个参数（之所以使用 this 是因为 Activity 类是 Context 的子类）
	- 应用组件的 Class，系统应将 Intent（在本例中，为应启动的 Activity）传递至该类。
* 使用putExtra键值对作为值存储方式
	- intent.putExtra(EXTRA_MESSAGE, message);
* 调用startActivity方法启动新activity
	- startActivity(intent);









