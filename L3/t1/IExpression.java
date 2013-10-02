/**
 * 
 */
package t1;

/**
 * @author Yuriy Gerasimov
 *
 */
public interface IExpression {
	/**
	 * 
	 * @return First differential of expression
	 */
	IExpression Diff();

    /**
     * 
     * @return String representation of expression
     */
	String Show();
	
}
