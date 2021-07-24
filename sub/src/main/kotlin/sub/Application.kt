package sub

import io.micronaut.context.ApplicationContext
import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("sub")
		.start()

	println(ApplicationContext.run().getBean(Stuff::class.java).getStuff())
}

