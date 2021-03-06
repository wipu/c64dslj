/* Copyright 2013 Jukka Pirinen

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package org.pirinen.c64dslj.model;

import org.pirinen.c64dslj.builder.DataType;

public class OneByteOperand extends OperandBase {
	private DataType<Byte> value;
	private byte[] data = new byte[1];

	public OneByteOperand(DataType<Byte> data) {
		value = data;
	}

	@Override
	public byte[] getData() {
		data[0] = (byte) (value.getValue() & 0xff);
		return data;
	}

	@Override
	public String toDsl() {
		return "(_" + value + ")";
	}

	@Override
	public int getValue() {
		return value.getValue();
	}

	@Override
	public String toString() {
		return "" + getValue();
	}

	@Override
	public int getLength() {
		return 1;
	}
}
