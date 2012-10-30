<%@include file="/WEB-INF/jsp/common/taglibs.jsp"%>
<stripes:layout-render name="/WEB-INF/jsp/common/layout_main.jsp"
                       title="Chart"
                       pageid="chart">

    <stripes:layout-component name="content">
            <div id="barChart" style="margin-top:20px; margin-left:20px; width:400px; height:300px;"></div>
            <div id="pieChart" style="margin-top:20px; margin-left:20px; width:400px; height:300px;"></div>
    </stripes:layout-component>

</stripes:layout-render>