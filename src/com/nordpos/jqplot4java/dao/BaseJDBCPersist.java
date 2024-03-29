/**
 *  Copyright (c) 2012 Nord Trading Ltd.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.nordpos.jqplot4java.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import net.sf.persist.Persist;

/**
 *
 * @author Andrey Svininykh <svininykh@gmail.com>
 */
public abstract class BaseJDBCPersist {

    public Persist persist;

    protected Connection getConnection() throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/nordpos-db",
                    "root",
                    "root");
        } catch (SQLException sqlex) {
        } catch (Exception ex) {
        }
        return null;
    }

    public boolean checkConnection() {
        return (persist.getConnection() != null);
    }
}
