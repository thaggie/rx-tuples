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

import org.junit.Assert;
import org.junit.Test;

import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func2;
import rx.functions.Func3;
import rx.functions.Func4;
import rx.functions.Func5;
import rx.functions.Func6;
import rx.functions.Func7;
import rx.functions.Func8;
import rx.functions.Func9;

public class RxTTest {

	private static class One {
		final int v = 1;
	};
	
	private static class Two {
		final int v = 2;
	};
	
	private static class Three {
		final int v = 3;
	};
	
	private static class Four {
		final int v = 4;
	};
	
	private static class Five {
		final int v = 5;
	};
	
	private static class Six {
		final int v = 6;
	};
	
	private static class Seven {
		final int v = 7;
	};
	
	private static class Eight {
		final int v = 8;
	};
	
	private static class Nine {
		final int v = 9;
	};

	@Test
	public void t2() {
		Observable.just(RxT.create(new One(), new Two()))
		.map(RxT.with(new Func2<One, Two, int[]>() {
			@Override
			public int[] call(One t1, Two t2) {
				int[] vs = {t1.v, t2.v};
				return vs;
			}
		}))
		.subscribe(new Action1<int[]>() {
			@Override
			public void call(int[] vs) {
				int[] expected = {1, 2};
				Assert.assertArrayEquals(expected, vs);
			}
		});
	}

	@Test
	public void t3() {
		Observable.just(RxT.create(new One(), new Two(), new Three()))
		.map(RxT.with(new Func3<One, Two, Three, int[]>() {
			@Override
			public int[] call(One t1, Two t2, Three t3) {
				int[] vs = {t1.v, t2.v, t3.v};
				return vs;
			}
		}))
		.subscribe(new Action1<int[]>() {
			@Override
			public void call(int[] vs) {
				int[] expected = {1, 2, 3};
				Assert.assertArrayEquals(expected, vs);
			}
		});
	}

	@Test
	public void t4() {
		Observable.just(RxT.create(new One(), new Two(), new Three(), new Four()))
		.map(RxT.with(new Func4<One, Two, Three, Four, int[]>() {
			@Override
			public int[] call(One t1, Two t2, Three t3, Four t4) {
				int[] vs = {t1.v, t2.v, t3.v, t4.v};
				return vs;
			}
		}))
		.subscribe(new Action1<int[]>() {
			@Override
			public void call(int[] vs) {
				int[] expected = {1, 2, 3, 4};
				Assert.assertArrayEquals(expected, vs);
			}
		});
	}

	@Test
	public void t5() {
		Observable.just(RxT.create(new One(), new Two(), new Three(), new Four(), new Five()))
		.map(RxT.with(new Func5<One, Two, Three, Four, Five, int[]>() {
			@Override
			public int[] call(One t1, Two t2, Three t3, Four t4, Five t5) {
				int[] vs = {t1.v, t2.v, t3.v, t4.v, t5.v};
				return vs;
			}
		}))
		.subscribe(new Action1<int[]>() {
			@Override
			public void call(int[] vs) {
				int[] expected = {1, 2, 3, 4, 5};
				Assert.assertArrayEquals(expected, vs);
			}
		});
	}

	@Test
	public void t6() {
		Observable.just(RxT.create(new One(), new Two(), new Three(), new Four(), new Five(), new Six()))
		.map(RxT.with(new Func6<One, Two, Three, Four, Five, Six, int[]>() {
			@Override
			public int[] call(One t1, Two t2, Three t3, Four t4, Five t5, Six t6) {
				int[] vs = {t1.v, t2.v, t3.v, t4.v, t5.v, t6.v};
				return vs;
			}
		}))
		.subscribe(new Action1<int[]>() {
			@Override
			public void call(int[] vs) {
				int[] expected = {1, 2, 3, 4, 5, 6};
				Assert.assertArrayEquals(expected, vs);
			}
		});
	}

	@Test
	public void t7() {
		Observable.just(RxT.create(new One(), new Two(), new Three(), new Four(), new Five(), new Six(), new Seven()))
		.map(RxT.with(new Func7<One, Two, Three, Four, Five, Six, Seven, int[]>() {
			@Override
			public int[] call(One t1, Two t2, Three t3, Four t4, Five t5, Six t6, Seven t7) {
				int[] vs = {t1.v, t2.v, t3.v, t4.v, t5.v, t6.v, t7.v};
				return vs;
			}
		}))
		.subscribe(new Action1<int[]>() {
			@Override
			public void call(int[] vs) {
				int[] expected = {1, 2, 3, 4, 5, 6, 7};
				Assert.assertArrayEquals(expected, vs);
			}
		});
	}

	@Test
	public void t8() {
		Observable.just(RxT.create(new One(), new Two(), new Three(), new Four(), new Five(), new Six(), new Seven(), new Eight()))
		.map(RxT.with(new Func8<One, Two, Three, Four, Five, Six, Seven, Eight, int[]>() {
			@Override
			public int[] call(One t1, Two t2, Three t3, Four t4, Five t5, Six t6, Seven t7, Eight t8) {
				int[] vs = {t1.v, t2.v, t3.v, t4.v, t5.v, t6.v, t7.v, t8.v};
				return vs;
			}
		}))
		.subscribe(new Action1<int[]>() {
			@Override
			public void call(int[] vs) {
				int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
				Assert.assertArrayEquals(expected, vs);
			}
		});
	}

	@Test
	public void t9() {
		Observable.just(RxT.create(new One(), new Two(), new Three(), new Four(), new Five(), new Six(), new Seven(), new Eight(), new Nine()))
		.map(RxT.with(new Func9<One, Two, Three, Four, Five, Six, Seven, Eight, Nine, int[]>() {
			@Override
			public int[] call(One t1, Two t2, Three t3, Four t4, Five t5, Six t6, Seven t7, Eight t8, Nine t9) {
				int[] vs = {t1.v, t2.v, t3.v, t4.v, t5.v, t6.v, t7.v, t8.v, t9.v};
				return vs;
			}
		}))
		.subscribe(new Action1<int[]>() {
			@Override
			public void call(int[] vs) {
				int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
				Assert.assertArrayEquals(expected, vs);
			}
		});
	}

}