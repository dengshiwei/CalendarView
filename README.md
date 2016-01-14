# CalendarView
一个日历控件,用于展示我们的业务数据，相比较上一次的实现，这次的实现改版了很多自定义属性。同时丰富了我们的模版样例，增加了农历节日的展示。

![效果图](http://img.blog.csdn.net/20160114115328099)

###自定义属性

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

使用很简单，星期和日期、顶部的标识都是分开模块实现的，可以根据需求进行组合使用。提高定制的灵活性。事务的设置通过DayAndPrice实体进行封装，WorkOrRelax封装我们的节假日。下面的效果图中就是集成组合出来的。具体的实例可以clone一份看看。

[博客](http://blog.csdn.net/mr_dsw/article/details/48755993)