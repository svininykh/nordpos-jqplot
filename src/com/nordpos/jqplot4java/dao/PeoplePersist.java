/**
 * Copyright (c) 2012 Nord Trading Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.nordpos.jqplot4java.dao;

import com.nordpos.jqplot4java.model.People;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.persist.Persist;

/**
 *
 * @author Andrey Svininykh <svininykh@gmail.com>
 */
public class PeoplePersist extends BaseJDBCPersist {

    public PeoplePersist() {
        try {
            persist = new Persist(getConnection());
        } catch (Exception ex) {
            Logger.getLogger(PeoplePersist.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public People findUser(String id) {
        return persist.read(People.class,
                "SELECT * FROM PEOPLE WHERE ID = ?",
                id);
    }

    public List<People> findUsers() {
        return persist.readList(People.class,
                "SELECT * FROM PEOPLE ORDER BY NAME");
    }

    public Integer countUsers() {
        return persist.read(Integer.class,
                "SELECT COUNT(ID) FROM PEOPLE");
    }

    public List<Integer> countUserTickets() {
        return persist.readList(Integer.class,
                "SELECT COUNT(TICKETS.TICKETID) "
                + "FROM PEOPLE "
                + "LEFT OUTER JOIN TICKETS ON TICKETS.PERSON = PEOPLE.ID "
                + "GROUP BY PEOPLE.NAME");
    }

    public Iterator readUserTickets() {
        return persist.readIterator(People.class,
                "SELECT PEOPLE.NAME, "
                + "COUNT(TICKETS.TICKETID) AS TICKETSSALES "
                + "FROM PEOPLE "
                + "LEFT OUTER JOIN TICKETS ON TICKETS.PERSON = PEOPLE.ID "
                + "GROUP BY PEOPLE.NAME "
                + "ORDER BY PEOPLE.NAME");
    }
}