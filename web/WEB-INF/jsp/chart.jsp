<%@include file="/WEB-INF/jsp/common/taglibs.jsp"%>
<stripes:layout-render name="/WEB-INF/jsp/common/layout_main.jsp"
                       title="Chart"
                       pageid="chart">

    <stripes:layout-component name="content">
            <div id="lineChart" style="margin-top:20px; margin-left:20px; width:600px; height:200px;"></div>
            <div id="areaChart" style="margin-top:20px; margin-left:20px; width:600px; height:200px;"></div>
            <div id="barChart" style="margin-top:20px; margin-left:20px; width:600px; height:200px;"></div>
            <div id="pieChart" style="margin-top:20px; margin-left:20px; width:600px; height:200px;"></div>
    </stripes:layout-component>

</stripes:layout-render>