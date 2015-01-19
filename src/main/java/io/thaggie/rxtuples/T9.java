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

final public class T9<V1,V2,V3,V4, V5, V6, V7, V8, V9> {
	
	protected final V1 v1;
	protected final V2 v2;
	protected final V3 v3;
	protected final V4 v4;
	protected final V5 v5;
	protected final V6 v6;
	protected final V7 v7;
	protected final V8 v8;
	protected final V9 v9;
	
	protected T9(V1 v1, V2 v2, V3 v3, V4 v4, V5 v5, V6 v6, V7 v7, V8 v8, V9 v9) {
		super();
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
		this.v4 = v4;
		this.v5 = v5;
		this.v6 = v6;
		this.v7 = v7;
		this.v8 = v8;
		this.v9 = v9;
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
		result = prime * result + ((v6 == null) ? 0 : v6.hashCode());
		result = prime * result + ((v7 == null) ? 0 : v7.hashCode());
		result = prime * result + ((v8 == null) ? 0 : v8.hashCode());
		result = prime * result + ((v9 == null) ? 0 : v9.hashCode());
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
		T9 other = (T9) obj;
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
		if (v6 == null) {
			if (other.v6 != null)
				return false;
		} else if (!v6.equals(other.v6))
			return false;
		if (v7 == null) {
			if (other.v7 != null)
				return false;
		} else if (!v7.equals(other.v7))
			return false;
		if (v8 == null) {
			if (other.v8 != null)
				return false;
		} else if (!v8.equals(other.v8))
			return false;
		if (v9 == null) {
			if (other.v9 != null)
				return false;
		} else if (!v9.equals(other.v9))
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
		sb.append(",");
		sb.append(v6);
		sb.append(",");
		sb.append(v7);
		sb.append(",");
		sb.append(v8);
		sb.append(",");
		sb.append(v9);
		
		sb.append(")");
		return sb.toString();
	}	
}