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

import rx.functions.Func1;
import rx.functions.Func2;
import rx.functions.Func3;
import rx.functions.Func4;
import rx.functions.Func5;
import rx.functions.Func6;
import rx.functions.Func7;
import rx.functions.Func8;
import rx.functions.Func9;

public class RxT {
	
	public static <V1,V2> T2<V1,V2> create(V1 a1, V2 a2) {
		return new T2<V1,V2>(a1, a2);
	}
	
	public static <V1,V2,R> Func1<T2<V1,V2>,R> with(Func2<V1, V2, R> fn) {
		return new Func1<T2<V1,V2>,R>(){
			@Override
			public R call(T2<V1, V2> t2) {
				return fn.call(t2.v1, t2.v2);
			}
		};
	}
		
	public static <V1,V2,V3> T3<V1,V2,V3> create(V1 v1, V2 v2, V3 v3) {
		return new T3<V1,V2,V3>(v1, v2, v3);
	}
	
	public static <V1,V2,V3,R> Func1<T3<V1,V2,V3>,R> with(Func3<V1,V2,V3, R> fn) {
		return new Func1<T3<V1,V2,V3>,R>(){
			@Override
			public R call(T3<V1,V2,V3> t) {
				return fn.call(t.v1, t.v2, t.v3);
			}
		};
	}
	
	public static <V1,V2,V3,V4> T4<V1,V2,V3,V4> create(V1 v1, V2 v2, V3 v3, V4 v4) {
		return new T4<V1,V2,V3,V4>(v1, v2, v3, v4);
	}
	
	public static <V1,V2,V3,V4,R> Func1<T4<V1,V2,V3,V4>,R> with(Func4<V1,V2,V3,V4, R> fn) {
		return new Func1<T4<V1,V2,V3,V4>,R>(){
			@Override
			public R call(T4<V1,V2,V3,V4> t) {
				return fn.call(t.v1, t.v2, t.v3, t.v4);
			}
		};
	}
	
	public static <V1,V2,V3,V4,V5> T5<V1,V2,V3,V4,V5> create(V1 v1, V2 v2, V3 v3, V4 v4, V5 v5) {
		return new T5<V1,V2,V3,V4,V5>(v1, v2, v3, v4, v5);
	}
	
	public static <V1,V2,V3,V4,V5,R> Func1<T5<V1,V2,V3,V4,V5>,R> with(Func5<V1,V2,V3,V4,V5, R> fn) {
		return new Func1<T5<V1,V2,V3,V4,V5>,R>(){
			@Override
			public R call(T5<V1,V2,V3,V4,V5> t) {
				return fn.call(t.v1, t.v2, t.v3, t.v4, t.v5);
			}
		};
	}
	
	public static <V1,V2,V3,V4,V5,V6> T6<V1,V2,V3,V4,V5,V6> create(V1 v1, V2 v2, V3 v3, V4 v4, V5 v5, V6 v6) {
		return new T6<V1,V2,V3,V4,V5,V6>(v1, v2, v3, v4, v5, v6);
	}
	
	public static <V1,V2,V3,V4,V5,V6,R> Func1<T6<V1,V2,V3,V4,V5,V6>,R> with(Func6<V1,V2,V3,V4,V5,V6,R> fn) {
		return new Func1<T6<V1,V2,V3,V4,V5,V6>,R>(){
			@Override
			public R call(T6<V1,V2,V3,V4,V5,V6> t) {
				return fn.call(t.v1, t.v2, t.v3, t.v4, t.v5, t.v6);
			}
		};
	}
	
	public static <V1,V2,V3,V4,V5,V6,V7,V8,V9> T7<V1,V2,V3,V4,V5,V6,V7> create(V1 v1, V2 v2, V3 v3, V4 v4, V5 v5, V6 v6 ,V7 v7) {
		return new T7<V1,V2,V3,V4,V5,V6,V7>(v1, v2, v3, v4, v5, v6, v7);
	}
	
	public static <V1,V2,V3,V4,V5,V6,V7,R> Func1<T7<V1,V2,V3,V4,V5,V6,V7>,R> with(Func7<V1,V2,V3,V4,V5,V6,V7, R> fn) {
		return new Func1<T7<V1,V2,V3,V4,V5,V6,V7>,R>(){
			@Override
			public R call(T7<V1,V2,V3,V4,V5,V6,V7> t) {
				return fn.call(t.v1, t.v2, t.v3, t.v4, t.v5, t.v6, t.v7);
			}
		};
	}
	public static <V1,V2,V3,V4,V5,V6,V7,V8> T8<V1,V2,V3,V4,V5,V6,V7,V8> create(V1 v1, V2 v2, V3 v3, V4 v4, V5 v5, V6 v6 ,V7 v7, V8 v8) {
		return new T8<V1,V2,V3,V4,V5,V6,V7,V8>(v1, v2, v3, v4, v5, v6, v7, v8);
	}
	
	public static <V1,V2,V3,V4,V5,V6,V7,V8,R> Func1<T8<V1,V2,V3,V4,V5,V6,V7,V8>,R> with(Func8<V1,V2,V3,V4,V5,V6,V7,V8, R> fn) {
		return new Func1<T8<V1,V2,V3,V4,V5,V6,V7,V8>,R>(){
			@Override
			public R call(T8<V1,V2,V3,V4,V5,V6,V7,V8> t) {
				return fn.call(t.v1, t.v2, t.v3, t.v4, t.v5, t.v6, t.v7, t.v8);
			}
		};
	}
	
	public static <V1,V2,V3,V4,V5,V6,V7,V8,V9> T9<V1,V2,V3,V4,V5,V6,V7,V8,V9> create(V1 v1, V2 v2, V3 v3, V4 v4, V5 v5, V6 v6 ,V7 v7, V8 v8, V9 v9) {
		return new T9<V1,V2,V3,V4,V5,V6,V7,V8,V9>(v1, v2, v3, v4, v5, v6, v7, v8, v9);
	}
	
	public static <V1,V2,V3,V4,V5,V6,V7,V8,V9,R> Func1<T9<V1,V2,V3,V4,V5,V6,V7,V8,V9>,R> with(Func9<V1,V2,V3,V4,V5,V6,V7,V8,V9, R> fn) {
		return new Func1<T9<V1,V2,V3,V4,V5,V6,V7,V8,V9>,R>(){
			@Override
			public R call(T9<V1,V2,V3,V4,V5,V6,V7,V8,V9> t) {
				return fn.call(t.v1, t.v2, t.v3, t.v4, t.v5, t.v6, t.v7, t.v8, t.v9);
			}
		};
	}

}
