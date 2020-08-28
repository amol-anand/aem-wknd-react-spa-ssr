import _taggedTemplateLiteral from "@babel/runtime/helpers/esm/taggedTemplateLiteral";
import styled from 'styled-components';

function _templateObject5() {
  var data = _taggedTemplateLiteral(["\n    display: inline-block;\n    border: 2px solid ", ";\n    color: ", ";\n    background: ", ";\n    padding: 15px 30px;\n    box-sizing: border-box;\n    text-align: center;\n    text-decoration: none;\n    transition: 250ms ease;\n    line-height: 1;\n    &:hover {\n      background: ", ";\n      color: ", ";\n    }\n  "]);

  _templateObject5 = function _templateObject5() {
    return data;
  };

  return data;
}

function _templateObject4() {
  var data = _taggedTemplateLiteral(["\n    margin: 0 auto 15px;\n    color: inherit;\n    font-size: ", ";\n  "]);

  _templateObject4 = function _templateObject4() {
    return data;
  };

  return data;
}

function _templateObject3() {
  var data = _taggedTemplateLiteral(["\n    margin: 0 auto 15px;\n    color: inherit;\n    font-size: ", ";\n  "]);

  _templateObject3 = function _templateObject3() {
    return data;
  };

  return data;
}

function _templateObject2() {
  var data = _taggedTemplateLiteral(["\n    display: block;\n    width: 100%;\n    margin-bottom: 15px;\n    img {\n      display: block;\n      width: 100%;\n    }\n  "]);

  _templateObject2 = function _templateObject2() {
    return data;
  };

  return data;
}

function _templateObject() {
  var data = _taggedTemplateLiteral(["\n    display: block;\n    width: 100%;\n    font-family: ", ";\n    color: ", ";\n  "]);

  _templateObject = function _templateObject() {
    return data;
  };

  return data;
}

var DEFAULT_COLOR = '#000000';
var DEFAULT_FG = '#222831';
var DEFAULT_BG = '#FFFFFF';
var DEFAULT_FONT_FAMILY = 'inherit';
var DEFAULT_H2_SIZE = '1.5em';
var DEFAULT_BODY_SIZE = '1em';
export default {
  TTAC: styled.section(_templateObject(), function (_ref) {
    var theme = _ref.theme;
    return theme.fontFamily || DEFAULT_FONT_FAMILY;
  }, function (_ref2) {
    var theme = _ref2.theme;
    return theme.color || DEFAULT_COLOR;
  }),
  ImageContainer: styled.div(_templateObject2()),
  Title: styled.h2(_templateObject3(), function (_ref3) {
    var theme = _ref3.theme;
    return theme.h2CopySize || DEFAULT_H2_SIZE;
  }),
  Content: styled.div(_templateObject4(), function (_ref4) {
    var theme = _ref4.theme;
    return theme.bodyCopySize || DEFAULT_BODY_SIZE;
  }),
  CTA: styled.a(_templateObject5(), function (_ref5) {
    var theme = _ref5.theme;
    return theme.ctaFg || DEFAULT_FG;
  }, function (_ref6) {
    var theme = _ref6.theme;
    return theme.ctaFg || DEFAULT_FG;
  }, function (_ref7) {
    var theme = _ref7.theme;
    return theme.ctaBg || DEFAULT_BG;
  }, function (_ref8) {
    var theme = _ref8.theme;
    return theme.ctaFg || DEFAULT_FG;
  }, function (_ref9) {
    var theme = _ref9.theme;
    return theme.ctaBg || DEFAULT_BG;
  })
};
