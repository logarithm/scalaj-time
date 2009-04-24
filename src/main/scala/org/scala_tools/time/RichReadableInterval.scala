/**
 * Copyright 2009 Jorge Ortiz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 *
 **/
package org.scala_tools.time

import org.joda.time._

class RichReadableInterval(iv: ReadableInterval) {
  def chronology: Chronology =
    iv.getChronology
  def end: DateTime =
    iv.getEnd
  def start: DateTime =
    iv.getStart

  // TODO: Should > and > be added as aliases for isAfter and isBefore?
  //   could be convenient, or just confusing because this isn't Ordered.
}