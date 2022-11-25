.class public Jasmin
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
	.limit stack 10
	.limit locals 10

	ldc 5
	istore_0
	ldc 6
	istore_1
	iload_0
	iload_1

	if_icmpgt EJEMPLO0
	goto SEGUIR0

	EJEMPLO0:
	getstatic java/lang/System/out Ljava/io/PrintStream; 
	iload_0
	invokevirtual java/io/PrintStream/println(I)V

	SEGUIR0:
	return
.end method
