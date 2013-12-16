/*
 ************************************************************************
 Copyright [2011] [PagSeguro Internet Ltda.]

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 ************************************************************************
 */

package br.com.uol.pagseguro.domain;

import br.com.uol.pagseguro.enums.EnumDocument;
import br.com.uol.pagseguro.helper.PagSeguroUtil;

/**
 * Represents document
 */
public class Document {

    /**
     * The type document
     * 
     * @var string
     */
    private String type;

    /**
     * The value document
     * 
     * @var string
     */
    private String value;

    /**
     * Construct Default
     */
    public Document() {
    }

    /**
     * Construct
     * 
     * @param type
     * @param value
     */
    public Document(String type, String value) {
        this.type = type;
        this.value = PagSeguroUtil.getOnlyNumbers(value);
    }

    /**
     * @return the type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @param type
     *            the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return this.value;
    }

    /**
     * @param value
     *            the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Check if document type is available for PagSeguro
     * 
     * @param documentType
     * @return
     */
    public static boolean isDocumentTypeAvailable(String documentType) {
        boolean available = false;
        for (EnumDocument document : EnumDocument.values()) {
            if (documentType.equalsIgnoreCase(document.getType())) {
                available = true;
            }
        }
        return available;
    }
}
