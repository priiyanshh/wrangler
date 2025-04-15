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

public class TimeDuration {
  private final long milliseconds;

  public TimeDuration(String input) {
    input = input.trim().toLowerCase();
    if (input.endsWith("ms")) {
      milliseconds = (long) Double.parseDouble(input.replace("ms", ""));
    } else if (input.endsWith("s")) {
      milliseconds = (long) (Double.parseDouble(input.replace("s", "")) * 1000);
    } else if (input.endsWith("min")) {
      milliseconds = (long) (Double.parseDouble(input.replace("min", "")) * 60 * 1000);
    } else if (input.endsWith("hr")) {
      milliseconds = (long) (Double.parseDouble(input.replace("hr", "")) * 60 * 60 * 1000);
    } else {
      milliseconds = 0;
    }
  }

  public long getMilliseconds() {
    return milliseconds;
  }
}
