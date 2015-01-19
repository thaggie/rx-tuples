/**
 * Copyright (c) 2015 Tom Haggie
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.thaggie.rxtuples;

final public class T5<V1,V2,V3,V4, V5> {
	
	protected final V1 v1;
	protected final V2 v2;
	protected final V3 v3;
	protected final V4 v4;
	protected final V5 v5;
	
	protected T5(V1 v1, V2 v2, V3 v3, V4 v4, V5 v5) {
		super();
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
		this.v4 = v4;
		this.v5 = v5;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((v1 == null) ? 0 : v1.hashCode());
		result = prime * result + ((v2 == null) ? 0 : v2.hashCode());
		result = prime * result + ((v3 == null) ? 0 : v3.hashCode());
		result = prime * result + ((v4 == null) ? 0 : v4.hashCode());
		result = prime * result + ((v5 == null) ? 0 : v5.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		@SuppressWarnings("rawtypes")
		T5 other = (T5) obj;
		if (v1 == null) {
			if (other.v1 != null)
				return false;
		} else if (!v1.equals(other.v1))
			return false;
		if (v2 == null) {
			if (other.v2 != null)
				return false;
		} else if (!v2.equals(other.v2))
			return false;
		if (v3 == null) {
			if (other.v3 != null)
				return false;
		} else if (!v3.equals(other.v3))
			return false;
		if (v4 == null) {
			if (other.v4 != null)
				return false;
		} else if (!v4.equals(other.v4))
			return false;
		if (v5 == null) {
			if (other.v5 != null)
				return false;
		} else if (!v5.equals(other.v5))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("(");
		sb.append(v1);
		sb.append(",");
		sb.append(v2);
		sb.append(",");
		sb.append(v3);
		sb.append(",");
		sb.append(v4);
		sb.append(",");
		sb.append(v5);
		sb.append(")");
		return sb.toString();
	}
}