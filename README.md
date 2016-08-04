##概述
这是一个自定义的View，谈不上项目，只是简单的实现了项目需求中的日历样式，所以特此记录分享给大家。

>这个工程项目已经不进行维护更新了，这是项目初期做的一个自定义View，现在已经新开一个库进行了重构，重新开发。新库欢迎大家star。新库地址会持续完善更新，地址[CalendarComponent](https://github.com/dengshiwei/CalendarComponent)

![效果图](http://img.blog.csdn.net/20160114115328099)

###一、自定义属性

	<resources>
	    <declare-styleable name="CalendarView">
	        <attr name="EnableDateColor" format="reference|color"/>			<!-- 可用事务日期的颜色 -->
	        <attr name="UnableDateColor" format="reference|color"/>			<!-- 不可用事务日期的颜色 -->
	        <attr name="CurrentColor" format="reference|color"/>			<!-- 今日日期的颜色 -->
	        <attr name="SelectBGColor" format="reference|color"/>			<!-- 选择日期的背景颜色 -->
	        <attr name="CircleColor" format="reference|color"/>				<!-- 事务圆的颜色 -->
	        <attr name="RelaxColor" format="reference|color"/>				<!-- 节假日的颜色 -->
	        <attr name="WorkColor" format="reference|color"/>				<!-- 调休日期的颜色 -->
	        <attr name="PriceColor" format="reference|color"/>				<!-- 底部事务文字的颜色 -->
	        <attr name="DateSize" format="dimension"/>						<!-- 日期的大小 -->
	        <attr name="PriceSize" format="dimension"/>						<!-- 事务文字的颜色 -->
	        <attr name="DateHeight" format="dimension"/>					<!-- 日期的单行高度 -->
	    </declare-styleable>
	</resources>

这是该自定义View中所涉及到的自定义属性，主要用于设置一些字体颜色、背景色之类的属性。

###二、国家法定假日“班”、“休”的设置

	private List<DayAndPrice> listDayAndPrice
	private List<WorkOrRelax> listWorkOrRelax

我们通过这两个集合进行存储，然后绘制。

具体实现大家拷贝源码吧！

[博客](http://blog.csdn.net/mr_dsw/article/details/48755993)