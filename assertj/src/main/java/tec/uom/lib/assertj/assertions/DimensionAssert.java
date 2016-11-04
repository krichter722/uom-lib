package tec.uom.lib.assertj.assertions;

import javax.measure.Dimension;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.util.Objects;

/**
 * {@link Dimension} specific assertions - Generated by CustomAssertionGenerator.
 */
public class DimensionAssert extends AbstractAssert<DimensionAssert, Dimension> {

  /**
   * Creates a new <code>{@link DimensionAssert}</code> to make assertions on actual Dimension.
   * @param actual the Dimension we want to make assertions on.
   */
  public DimensionAssert(Dimension actual) {
    super(actual, DimensionAssert.class);
  }

  /**
   * An entry point for DimensionAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myDimension)</code> and get specific assertion with code completion.
   * @param actual the Dimension we want to make assertions on.
   * @return a new <code>{@link DimensionAssert}</code>
   */
  public static DimensionAssert assertThat(Dimension actual) {
    return new DimensionAssert(actual);
  }

  /**
   * Verifies that the actual Dimension's baseDimensions is equal to the given one.
   * @param baseDimensions the given baseDimensions to compare the actual Dimension's baseDimensions to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Dimension's baseDimensions is not equal to the given one.
   */
  public DimensionAssert hasBaseDimensions(java.util.Map baseDimensions) {
    // check that actual Dimension we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting baseDimensions of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    java.util.Map actualBaseDimensions = actual.getBaseDimensions();
    if (!Objects.areEqual(actualBaseDimensions, baseDimensions)) {
      failWithMessage(assertjErrorMessage, actual, baseDimensions, actualBaseDimensions);
    }

    // return the current assertion for method chaining
    return this;
  }

}
