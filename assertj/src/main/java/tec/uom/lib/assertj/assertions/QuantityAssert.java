package tec.uom.lib.assertj.assertions;

import javax.measure.Quantity;
import javax.measure.Unit;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.util.Objects;

/**
 * {@link Quantity} specific assertions - Generated by CustomAssertionGenerator.
 */
public class QuantityAssert extends AbstractAssert<QuantityAssert, Quantity> {

  /**
   * Creates a new <code>{@link QuantityAssert}</code> to make assertions on actual Quantity.
   * @param actual the Quantity we want to make assertions on.
   */
  public QuantityAssert(Quantity actual) {
    super(actual, QuantityAssert.class);
  }

  /**
   * An entry point for QuantityAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myQuantity)</code> and get specific assertion with code completion.
   * @param actual the Quantity we want to make assertions on.
   * @return a new <code>{@link QuantityAssert}</code>
   */
  public static QuantityAssert assertThat(Quantity actual) {
    return new QuantityAssert(actual);
  }

  /**
   * Verifies that the actual Quantity's unit is equal to the given one.
   * @param unit the given unit to compare the actual Quantity's unit to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Quantity's unit is not equal to the given one.
   */
  public QuantityAssert hasUnit(Unit unit) {
    // check that actual Quantity we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting unit of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    Unit actualUnit = actual.getUnit();
    if (!Objects.areEqual(actualUnit, unit)) {
      failWithMessage(assertjErrorMessage, actual, unit, actualUnit);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Quantity's value is equal to the given one.
   * @param value the given value to compare the actual Quantity's value to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Quantity's value is not equal to the given one.
   */
  public QuantityAssert hasValue(Number value) {
    // check that actual Quantity we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting value of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    Number actualValue = actual.getValue();
    if (!Objects.areEqual(actualValue, value)) {
      failWithMessage(assertjErrorMessage, actual, value, actualValue);
    }

    // return the current assertion for method chaining
    return this;
  }

}