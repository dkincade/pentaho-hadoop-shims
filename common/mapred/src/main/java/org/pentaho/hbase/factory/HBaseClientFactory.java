/*******************************************************************************
*
* Pentaho Big Data
*
* Copyright (C) 2002-2015 by Pentaho : http://www.pentaho.com
*
*******************************************************************************
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with
* the License. You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*
******************************************************************************/
package org.pentaho.hbase.factory;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.pentaho.hbase.mapred.PentahoTableInputFormat;

public interface HBaseClientFactory {
  HBaseTable getHBaseTable( String tableName );
  HBaseAdmin getHBaseAdmin();
  HTableDescriptor getHBaseTableDescriptor( String tableName );
  HBaseTable wrap( Object tableObject );
  PentahoTableInputFormat getTableInputFormatImpl(
      PentahoTableInputFormat pentahoTableInputFormatBase,
      Configuration conf );
  HBasePut getHBasePut( byte[] key );
  void close();
}
