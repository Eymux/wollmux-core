package de.muenchen.allg.itd51.wollmux.core.document.nodes;

/**
 * Wird von Nodes implementiert, die Formularsteuerelemente darstellen.
 *
 * @author Matthias Benkmann (D-III-ITD 5.1)
 */
public interface FormControl
{
  /**
   * Rückgabewert für {@link FormControl#getType()} im Falle einer Checkbox.
   */
  public static final int CHECKBOX_CONTROL = 0;

  /**
   * Rückgabewert für {@link FormControl#getType()} im Falle einer Eingabeliste.
   */
  public static final int DROPDOWN_CONTROL = 1;

  /**
   * Rückgabewert für {@link FormControl#getType()} im Falle eines Eingabefeldes.
   */
  public static final int INPUT_CONTROL = 2;


  /**
   * Liefert die Art des Steuerelements, z,B, {@link FormControl#CHECKBOX_CONTROL}.
   *
   * @return Art des Steuerelements.
   */
  public int getType();

  /**
   * Liefert einen String, der das Steuerelement beschreibt. Bei Eingabefeldern ist
   * dies z.B. der "Hinweis"-Text.
   */
  public String getDescriptor();

  /**
   * Legt ein Bookmark mit gewünschtem Namen bmName um das Steuerelement und
   * liefert den Namen mit dem das Bookmark tatsächlich erzeugt wurde zurück.
   */
  public String surroundWithBookmark(String bmName);

  /**
   * Liefert den aktuell im Steuerelement eingestellten Wert zurück. Boolesche
   * Steuerelemente (Checkbox) liefern "true" oder "false".
   */
  public String getString();
}