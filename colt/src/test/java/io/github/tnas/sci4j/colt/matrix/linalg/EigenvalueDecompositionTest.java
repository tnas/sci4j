package io.github.tnas.sci4j.colt.matrix.linalg;

import cern.colt.matrix.impl.DenseDoubleMatrix2D;
import cern.colt.matrix.linalg.EigenvalueDecomposition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EigenvalueDecompositionTest {

	@Test
	void should_calculate_eigenvalues_correctly() {
		
		var matrixEntries = new double[][] { { 16, -24, 18 }, { 3, -2, 0 }, { -9, 18, -17 } };
		var eigenDecomposition = new EigenvalueDecomposition(new DenseDoubleMatrix2D(matrixEntries));
		var matrixResult = eigenDecomposition.getRealEigenvalues();

		assertEquals(3, matrixResult.cardinality());
		assertEquals(4, Math.round(matrixResult.get(0)));
		assertEquals(1, Math.round(matrixResult.get(1)));
		assertEquals(-8, Math.round(matrixResult.get(2)));

		System.out.println(eigenDecomposition.toString());
	}

}
