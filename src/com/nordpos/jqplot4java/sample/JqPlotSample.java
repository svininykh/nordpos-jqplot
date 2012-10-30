/*
 *  Copyright 2010 inaiat.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */
package com.nordpos.jqplot4java.sample;

import br.com.digilabs.jqplot.JqPlotUtils;
import br.com.digilabs.jqplot.chart.AreaChart;
import br.com.digilabs.jqplot.chart.BarChart;
import br.com.digilabs.jqplot.chart.LineChart;
import br.com.digilabs.jqplot.chart.PieChart;
import com.nordpos.jqplot4java.dao.PeoplePersist;
import com.nordpos.jqplot4java.model.People;
import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author inaiat
 */
public class JqPlotSample {

    public static String lineChart(String divId) {
        LineChart<Integer> lineChart;
        lineChart = new LineChart<Integer>("Line Chart");
        lineChart.addValues(1, 2, 3, 4, 5);
        return JqPlotUtils.createJquery(lineChart, divId);
    }

    public static String areaChart(String divId) {
        AreaChart<Integer> areaChart;
        areaChart = new AreaChart<Integer>("Area Char");
        areaChart.addValue(Arrays.<Integer>asList(11, 9, 5, 12, 14));
        areaChart.addValue(Arrays.<Integer>asList(4, 8, 5, 3, 6));
        areaChart.addValue(Arrays.<Integer>asList(12, 6, 13, 11, 2));
        return JqPlotUtils.createJquery(areaChart, divId);
    }

    public static String barChart(String divId) {
        BarChart<Integer> barChart;
        barChart = new BarChart<Integer>("Bar Chart");

        barChart.setPadMin(1.05f);
        barChart.setStackSeries(true);
        barChart.setCaptureRightClick(true);
        barChart.setHighlightMouseDown(true);

        barChart.setBarMargin(30);
        barChart.addValue(new PeoplePersist().countUserTickets());

//        barChart.setTicks("A", "B", "C", "D");
//        barChart.addValue(Arrays.<Integer>asList(200, 600, 700, 1000));
//        barChart.addValue(Arrays.<Integer>asList(200, 600, 700, 1000));
//        barChart.addValue(Arrays.<Integer>asList(200, 600, 700, 1000));
        // Texto das Legendas.
//        barChart.addSeries(new Serie("A"), new Serie("B"), new Serie("C"));
//        barChart.addSeries(new Serie("A"));

        return JqPlotUtils.createJquery(barChart, divId);
    }

    public static String pieChart(String divId) {
        PeoplePersist peopleDao = new PeoplePersist();
        PieChart<Integer> pizzaChart = new PieChart<Integer>("Pizza Chart");

        Iterator ticketsSales = peopleDao.readUserTickets();
        while (ticketsSales.hasNext()) {
            People currentUser = (People) ticketsSales.next();
            pizzaChart.addValue(currentUser.getName(), currentUser.getTicketsSales());
        }

        return JqPlotUtils.createJquery(pizzaChart, divId);
    }
}
