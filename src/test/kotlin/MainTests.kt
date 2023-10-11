import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.nulls.shouldNotBeNull

class MainTests : BehaviorSpec({
    given("Happy Path") {
        val sut = App()

        `when`("App.greeting") {
            val result = sut.greeting

            then("Matches Expected") {
                result.shouldNotBeNull()
            }
        }
    }

})