// package ie.williamswalsh;
//
// /**
//  * @author William Walsh
//  * @version 02 Oct 2022
//  */
// public class ArgsException extends Exception {
//     private char errorArgumentId = '\0';
//     private String errorParameter = "TILT";
//     private ErrorCode errorCode = ErrorCode.OK;
//
//     public ArgsException() {}
//
//     public ArgsException(String message) {
//         super(message);
//     }
//
//     public ArgsException(ErrorCode errorCode) {
//         this.errorCode = errorCode;
//     }
//
//     public ArgsException(ErrorCode errorCode, String errorParameter) {
//         this.errorCode = errorCode;
//         this.errorParameter = errorParameter;
//     }
//
//     public ArgsException(ErrorCode errorCode, char errorArgumentId, String errorParameter) {
//         this.errorCode = errorCode;
//         this.errorParameter = errorParameter;
//         this.errorArgumentId = errorArgumentId;
//     }
//
//     private char getErrorArgumentId() {
//         return errorArgumentId;
//     }
//
//     private void setErrorArgumentId(char errorArgumentId) {
//         this.errorArgumentId = errorArgumentId;
//     }
//
//     private String getErrorParameter() {
//         return errorParameter;
//     }
//
//     private void setErrorParameter(String errorParameter) {
//         this.errorParameter = errorParameter;
//     }
//
//     private ErrorCode getErrorCode() {
//         return errorCode;
//     }
//
//     private void setErrorCode(ErrorCode errorCode) {
//         this.errorCode = errorCode;
//     }
// }
