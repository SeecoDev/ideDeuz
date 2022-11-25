.class public Jasmin
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
	.limit stack 10
	.limit locals 10

	ldc 0
	iload_0

	ldc 0
	iload_1

	iload_1
	ldc 1
	isum
	istore_1

	getstatic java/lang/System/out Ljava/io/PrintStream;
    iload_1
    invokevirtual java/io/PrintStream/println(I)V

	return
.end method

