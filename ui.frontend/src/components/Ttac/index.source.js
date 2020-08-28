import React from 'react';
import Styled from './index.styled';
export var TTACContainer = function TTACContainer(_ref) {
  var maxWidth = _ref.maxWidth,
      children = _ref.children;
  return /*#__PURE__*/React.createElement(Styled.TTAC, {
    style: {
      maxWidth: maxWidth
    }
  }, children);
};
export var TTACImage = function TTACImage(_ref2) {
  var image = _ref2.image,
      alt = _ref2.alt;
  return /*#__PURE__*/React.createElement(Styled.ImageContainer, null, /*#__PURE__*/React.createElement("img", {
    src: image,
    alt: alt
  }));
};
export var TTACTitle = function TTACTitle(_ref3) {
  var title = _ref3.title;
  return /*#__PURE__*/React.createElement(Styled.Title, null, title);
};
export var TTACText = function TTACText(_ref4) {
  var text = _ref4.text;
  return /*#__PURE__*/React.createElement(Styled.Content, null, text);
};
export var TTACCta = function TTACCta(_ref5) {
  var ctaText = _ref5.ctaText,
      ctaHref = _ref5.ctaHref;
  return /*#__PURE__*/React.createElement(Styled.CTA, {
    href: ctaHref
  }, ctaText);
};

var TTAC = function TTAC(_ref6) {
  var image = _ref6.image,
      title = _ref6.title,
      text = _ref6.text,
      ctaText = _ref6.ctaText,
      ctaHref = _ref6.ctaHref,
      maxWidth = _ref6.maxWidth;
  return /*#__PURE__*/React.createElement(TTACContainer, {
    maxWidth: maxWidth
  }, image && /*#__PURE__*/React.createElement(TTACImage, {
    image: image,
    alt: title
  }), title && /*#__PURE__*/React.createElement(TTACTitle, {
    title: title
  }), text && /*#__PURE__*/React.createElement(TTACText, {
    text: text
  }), ctaText && /*#__PURE__*/React.createElement(TTACCta, {
    ctaText: ctaText,
    ctaHref: ctaHref
  }));
};

export default TTAC;