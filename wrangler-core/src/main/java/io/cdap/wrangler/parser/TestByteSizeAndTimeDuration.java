/*
 * Copyright © 2025 Cask Data, Inc.
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

package io.cdap.wrangler.parser;

import io.cdap.wrangler.parser.ByteSize;
import io.cdap.wrangler.parser.TimeDuration;

public class TestByteSizeAndTimeDuration {
  public static void main(String[] args) {
    ByteSize b1 = new ByteSize("10KB");
    ByteSize b2 = new ByteSize("1.5MB");
    System.out.println("10KB in bytes: " + b1.getBytes());
    System.out.println("1.5MB in bytes: " + b2.getBytes());

    TimeDuration t1 = new TimeDuration("2hr");
    TimeDuration t2 = new TimeDuration("3.5min");
    System.out.println("2hr in ms: " + t1.getMilliseconds());
    System.out.println("3.5min in ms: " + t2.getMilliseconds());
  }
}
