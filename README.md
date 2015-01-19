# rx-tuples
A set of tuples for working with RxJava, a tuple allows you to return more than one value from a function.

The idea behind these classes is to have a tuple per FuncX class in [RxJava](https://github.com/ReactiveX/RxJava) and that the tuples are consumed by using these functions.

While tuples for all FuncX classes have been added if you're using more than 3 arguments like this it's likely your code is unreadable.

##Usage
When a function needs to return more than one value then a tuple can be used:
```Java
	return RxT.create(foo, bar baz);
```

When the mutiple values from a function need to be consumed then a function with the same number of arguments is used:
```Java
	.map(RxT.with(new Func3<Foo, Bar, Baz, String>() {
		@Override
		public String call(Foo foo, Bar bar, Baz, baz) {
			return "" + foo + bar + baz;
		}
	}
```

##Building
`gradle jar test`


##License
[Apache 2](http://www.apache.org/licenses/LICENSE-2.0)
