<%--
    Document   : layout_main
    Created on : 26.10.2012, 20:39:00
    Author     : Andrey Svininykh (svininykh@gmail.com)
    Copyright  : Nord Trading Ltd.
    License    : Apache License, Version 2.0 (http://www.apache.org/licenses/LICENSE-2.0.html)
--%>

<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="com.nordpos.jqplot4java.sample.JqPlotSample" %>
<%@include file="/WEB-INF/jsp/common/taglibs.jsp"%>

<stripes:layout-definition>
    <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

    <html lang="en">
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
            <!-- Use Compatibility mode in IE -->
            <title>JqPlot4Java Sample</title>
            <!--[if lt IE 9]><script language="javascript" type="text/javascript" src="../excanvas.js"></script><![endif]-->

            <link rel="stylesheet" type="text/css" href="css/jquery.jqplot.min.css" />
            <!-- BEGIN: load jquery -->
            <script language="javascript" type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
            <!-- END: load jquery -->

            <!-- BEGIN: load jqplot -->
            <script language="javascript" type="text/javascript" src="js/jquery.jqplot.min.js"></script>
            <script language="javascript" type="text/javascript" src="js/plugins/jqplot.barRenderer.min.js"></script>
            <script language="javascript" type="text/javascript" src="js/plugins/jqplot.highlighter.min.js"></script>
            <script language="javascript" type="text/javascript" src="js/plugins/jqplot.cursor.min.js"></script>
            <script language="javascript" type="text/javascript" src="js/plugins/jqplot.barRenderer.min.js"></script>
            <script language="javascript" type="text/javascript" src="js/plugins/jqplot.categoryAxisRenderer.min.js"></script>
            <script language="javascript" type="text/javascript" src="js/plugins/jqplot.pointLabels.min.js"></script>
            <script language="javascript" type="text/javascript" src="js/plugins/jqplot.pieRenderer.min.js"></script>
            <script language="javascript" type="text/javascript" src="js/plugins/jqplot.donutRenderer.min.js"></script>
            <!-- END: load jqplot -->

            <style type="text/css">
                .jqplot-target {
                    margin-bottom: 2em;
                }

                pre {
                    background: #D8F4DC;
                    border: 1px solid rgb(200, 200, 200);
                    padding-top: 1em;
                    padding-left: 3em;
                    padding-bottom: 1em;
                    margin-top: 1em;
                    margin-bottom: 4em;

                }

                p {
                    margin: 2em 0;
                }

                .note {
                    font-size: 0.8em;
                }

                .jqplot-breakTick {

                }
            </style>

            <script class="code" type="text/javascript">

                $(document).ready(function () {

                <%=JqPlotSample.barChart("barChart")%>

                <%=JqPlotSample.pieChart("pieChart")%>

                    });

            </script>
        </head>
        <body>
            <div data-role="page" id="${pageid}">
                <div data-role="content" style="padding: 15px" align="center">
                    <stripes:layout-component name="content"/>
                </div>
            </div>
        </body>
    </html>
</stripes:layout-definition>

